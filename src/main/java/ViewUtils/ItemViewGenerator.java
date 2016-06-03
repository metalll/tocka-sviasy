package ViewUtils;

import model.Model;

public class ItemViewGenerator {
	public static String generateView(Model item){
		String View = 
		
				" <div class=\"col s4\"><div class=\"row\"><div class=\"col s12\"><div class=\"card\">"+
                " <div class=\"card-image\"><img src=\""+ item.getLogo() + "\">"+
                " </div> <div class=\"card-content valign-wrapper\">"+
                " <span class=\"card-title blue-text left-align  text-darken-2\">"+item.getName()+"</span>"+
                " <h5 class=\"right-align green-text\">"+item.getPrice()+"</h5>"+
                    "</div>"+
                    "<div class=\"card-action valign-wrapper\">"+

                        "<a class = \"green-text center-align\" >"+item.getExist()+"</a>"+
                        "<p/>"+
                        "<button href=\"#\" class = \"waves-effect waves-light btn blue center-align\" >подробнее</button>"+
                        "</div>"+

                "</div>"+
            "</div>"+
        "</div></div>";
		
		return View;
	}
}
