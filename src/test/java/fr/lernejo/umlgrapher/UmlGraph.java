package fr.lernejo.umlgrapher;

public class UmlGraph {

    public UmlGraph(Class<fr.lernejo.UmlGraphTests.Machin> machinClass) {
        System.out.println(machinClass);
    }
    public String as(GraphType graphType){
        if(graphType == GraphType.Mermaid){
            return "classDiagram"+
            "class Machin {"+
    "<<interface>>"+
            "}";

        }
        return "";
    }
}
