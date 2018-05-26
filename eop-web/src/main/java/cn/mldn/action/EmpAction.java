package cn.mldn.action;

import java.util.Arrays;

import cn.mldn.util.bean.ResourceUtil;
import cn.mldn.util.web.SplitPageUtil;
import cn.mldn.util.web.action.AbstractAction;
import cn.mldn.util.web.annotation.Controller;
import cn.mldn.util.web.annotation.RequestMapping;
import cn.mldn.util.web.servlet.ModelAndView;
import cn.mldn.util.web.servlet.ServletObjectUtil;
import cn.mldn.vo.Emp;

@Controller
@RequestMapping("/pages/back/admin/emp/*")
public class EmpAction extends AbstractAction {
	@RequestMapping("emp_add_pre")
	public String addPre() {
		return super.getPage("EmpAction.add.page");
	} 
	@RequestMapping("emp_edit_pre")
	public String editPre(long empno) {
		return "/pages/back/admin/emp/emp_edit.jsp";
	} 
	@RequestMapping("emp_edit")
	public void edit(Emp vo) {
		System.out.println("*** 验证通过，获取数据：" + vo);
	}
	@RequestMapping("emp_list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView(super.getPage("EmpAction.list.page")) ;
		String columnData = "姓名:name|性别:sex|简介:note" ;
		String url = "cn.mldn.action.EmpAction.list.action" ;
		SplitPageUtil spu = new SplitPageUtil(columnData, url);
		System.out.println("当前页：" + spu.getCurrentPage() + "、每页显示行：" + spu.getLineSize());
		mav.add("allRecorders", 100L);
		return mav ;
	}

	@RequestMapping("emp_add")
	public String add(String msg, boolean status, Emp emp, String[] inst, Long[] item) {
		System.err.println("*** 照片名称：" + ServletObjectUtil.getParameter().createUUIDFileName("photo"));
		System.err.println("*** 信息：" + msg + "、处理标记：" + status);
		System.err.println("*** 信息：" + Arrays.toString(inst)); 
		System.err.println("*** 信息：" + Arrays.toString(item));
		System.err.println(emp); 
		ServletObjectUtil.getRequest().setAttribute("msg", "雇员信息增加成功！");
		return ResourceUtil.getPage("forward.page");
	}
}
