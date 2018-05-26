package cn.mldn.action;

import java.io.IOException;

import cn.mldn.service.IDeptService;
import cn.mldn.util.web.annotation.Autowired;
import cn.mldn.util.web.annotation.Controller;
import cn.mldn.util.web.annotation.RequestMapping;
import cn.mldn.util.web.servlet.ModelAndView;
import cn.mldn.util.web.servlet.ServletObjectUtil;
@Controller 
@RequestMapping("/pages/back/admin/dept/*")
public class DeptAction {
	@Autowired
	private IDeptService deptService ;  
	
	@RequestMapping("dept_add_pre")
	public String addPre() { 
		return "/pages/back/admin/dept/dept_add.jsp" ; 
	}
	@RequestMapping("dept_add")
	public String add() { 
		try {
			this.deptService.add(null) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("****************** 部门增加 ******************");
		ServletObjectUtil.getRequest().setAttribute("msg", "部门增加成功！");
		return "/pages/plugins/forward.jsp" ; 
	}
	@RequestMapping("dept_list") 
	public ModelAndView list() throws Exception {
		if (true) {
			throw new Exception("我出错了") ;
		}
		ModelAndView mav = new ModelAndView("/pages/back/admin/dept/dept_list.jsp") ;
		mav.add("allRecorders", 19);
		mav.add("allDepts", this.deptService.list());
		return mav ;
	}
	@RequestMapping("dept_info") 
	public void info() {
		try {
			ServletObjectUtil.getResponse().getWriter().println("www.mldn.cn");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String edit() { 
		return "forward.jsp" ;
	}
}
