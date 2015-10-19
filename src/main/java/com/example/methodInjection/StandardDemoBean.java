package com.example.methodInjection;

/**
 * Created by krishna_hotha on 4/10/15.
 */
public class StandardDemoBean implements DemoBean {

	private HelperBean helperBean;

	@Override
	public HelperBean getHelperBean() {
		return helperBean;
	}

	public void setHelperBean(HelperBean helperBean) {
		this.helperBean = helperBean;
	}

	@Override
	public void doSomeThing() {
		getHelperBean().doSomethingUseful();
	}
}
