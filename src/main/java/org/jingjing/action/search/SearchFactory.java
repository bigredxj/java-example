package org.jingjing.action.search;

public class SearchFactory {

    public Search getSearch(String str){
        Search search = new Baidu();
        switch(str.toLowerCase()){
            case "baidu":
                search = new Baidu();
                break;
            default:
                search = new Baidu();
        }
        return search;
    }


}
