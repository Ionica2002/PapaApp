package ro.esolutions.PapaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConectorExtern {
    @GetMapping("/churches")
    public String getAllChurches() {
        //de facut o biserica noua
        //in loc de return un text chior, return ".. sunt" + nume biserica;

        Biserica sfNicolae = new Biserica();

        sfNicolae.nume= "Sfantu Nicolae";
        sfNicolae.LunaDeVizita = "Decembrie";
        sfNicolae.tipReligie="catolic";

        return "Bisericile mele sunt:" + sfNicolae.nume;
    }
}
