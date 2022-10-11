package proto1.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import proto1.domain.GeneralRequest;
import proto1.domain.GeneralResponse;
import proto1.domain.master.DataSet;
import proto1.domain.master.ObjectControlBean;
import proto1.domain.parameter.HeaderData;
import proto1.domain.parameter.WPO;

@Controller
@RequestMapping("/KAZ0101")
public class Kaz0101Controller {

	private Logger log = LogManager.getLogger(Kaz0101Controller.class);

	@RequestMapping("/open")
	@ResponseBody
	public GeneralRequest open() {

		log.debug("-- open --");

		List<ObjectControlBean> ocl = new ArrayList<ObjectControlBean>();
		ObjectControlBean ob1 = new ObjectControlBean();
		ob1.setCompCd("EXA");
		ob1.setObjectCd("uo_1");
	    ob1.setPage(0);
	    ob1.setJWidth(200);
	    ob1.setJHeight(22);
	    ocl.add(ob1);

	    GeneralRequest res = new GeneralRequest();
	    WPO w = new WPO();
		w.setParameter(1, "111");
		res.setWpo(w);
		//res.setObjectControlList(ocl);


		return res;
	}

	@RequestMapping("/search")
	@ResponseBody
	public GeneralResponse search(@RequestBody GeneralRequest wpo) {

		log.debug("-- search --");
		log.debug(wpo);

		DataSet ds = new DataSet();
		HeaderData header = new HeaderData();
		header.setClmNm("test1");
		HeaderData header1 = new HeaderData();
		header1.setClmNm("test2");
		ds.addHeader(header1);
		ds.addRow();
		ds.setValue("test1", 1, "abc");
		ds.setValue("test2", 1, "あああ");

		GeneralResponse res = new GeneralResponse();
		res.setValue("dw_1", 0, ds);
		WPO w = new WPO();
		w.setParameter(1, "111");
		res.setWpo(w);

		return res;

	}

}
