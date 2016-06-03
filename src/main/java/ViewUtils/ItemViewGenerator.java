package ViewUtils;

import model.Model;

public class ItemViewGenerator {
	public static String generateView(Model item){
		String View = 
		
				" <div class=\"col s4\"><div class=\"row\">"		//div1
				+ "	<div class=\"col s12\"><div class=\"card\">"+	//div2
                " 		<div class=\"card-image\"><img src=\""+ item.getLogo() + "\">"+ //div3
                	  " </div>"								//div3 close
                + " <div class=\"card-content valign-wrapper\">"+	//div4
                " <span class=\"card-title blue-text  text-darken-2\">"+item.getName()+"</span>"+
                "<hr>"+
                " <h5 class=\"right-align green-text\">"+item.getPrice()+"</h5>"+
                	   "</div>"+
                	   "<div class=\"card-action valign-wrapper\">"+

                        "<a class = \"green-text center-align\" >"+item.getExist()+"</a>"+
                        "<p/>"+
                        "<a href=\"./MORE?id="+item.getId()+"\" class = \"waves-effect waves-light btn blue center-align\" >подробнее</a>"+
                        "</div>"+

                	"</div>"+
            "</div>"+
        "</div></div>";
		
		return View;
	}
	
	
	
}
