package ro.esolutions.PapaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConectorExtern {
    @GetMapping("/churches/{month}")
    public String getAllChurches(@PathVariable String month) {
        //de facut o biserica noua
        //in loc de return un text chior, return ".. sunt" + nume biserica;

        String raspuns = "Bisericile mele sunt:";
        List<Biserica> biserici = new ArrayList<>();

        Biserica sfNicolae = new Biserica();
        sfNicolae.nume= "Sfantu Nicolae";
        sfNicolae.LunaDeVizita = "Decembrie";
        sfNicolae.tipReligie="catolic";

        Biserica sfLebi = new Biserica();
        sfLebi.nume = "Sfantul Lebron";
        sfLebi.LunaDeVizita = "Ianuarie";
        sfLebi.tipReligie = "budist";

        Biserica sfJon = new Biserica();
        sfJon.nume = "Sfantul Jon";
        sfJon.LunaDeVizita = "Mai";
        sfJon.tipReligie = "musulman";

        Biserica sfAndrei = new Biserica();
        sfAndrei.nume = "Sfantul Andrei";
        sfAndrei.LunaDeVizita = "Iunie";
        sfAndrei.tipReligie = "musulman";

        Biserica sfDavid = new Biserica();
        sfDavid.nume = "Sfantul David";
        sfDavid.LunaDeVizita = "August";
        sfDavid.tipReligie = "ortodox";

        Biserica sfBasescu = new Biserica();
        sfBasescu.nume = "Sfantul Basescu";
        sfBasescu.LunaDeVizita = "August";
        sfBasescu.tipReligie = "ortodox";


        biserici.add(sfAndrei);
        biserici.add(sfBasescu);
        biserici.add(sfDavid);
        biserici.add(sfJon);
        biserici.add(sfLebi);
        biserici.add(sfNicolae);


        for (int i=0; i< biserici.size(); i++)
        {
            if(biserici.get(i).LunaDeVizita.equals(month))
                raspuns += biserici.get(i).nume + ",";
        }




        return raspuns;
    }
}
