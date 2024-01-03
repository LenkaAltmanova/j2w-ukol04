package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VizitkaService {
  private final List<Vizitka> seznamVizitek = new ArrayList<>();
    private final String userDidntProvideParameterMessage = "n/a";

  public VizitkaService() {
    seznamVizitek.add(
            new Vizitka(
                    "Dita (Přikrylová) Formánková",
                    "Czechitas z. s.",
                    "Václavské náměstí 837/11",
                    "11000 Praha 1",
                    "dita@czechitas.cs",
                    "+420 800123456",
                    "www.czechitas.cz"
            )
    );
    seznamVizitek.add(
            new Vizitka(
                    "Barbora Bühnová",
                    "Czechitas z. s.",
                    "Škrobárenská 511/3",
                    "61700 Brno",
                    "m@brno.cz",
                    "+420 800123456",
                    "www.czechitas.cz"
            )
    );
    seznamVizitek.add(
            new Vizitka(
                    "Monika Ptáčníková",
                    "Czechitas z. s.",
                    "Technologická 372/2",
                    "70800 Ostrava-Pustkovec",
                    "monika@czechitas.cs",
                    "+420 800123456",
                    "www.czechitas.cz"
            )
    );
    seznamVizitek.add(
            new Vizitka(
                    "Mirka Zatloukalová",
                    "Czechitas z. s.",
                    "Vavrečkova 5262",
                    "76001 Zlín",
                    "mirka@czechitas.cs",
                    "88888888",
                    "www.czechitas.cz"
            )
    );
    seznamVizitek.add(
            new Vizitka(
                    "Ondřej Čejka",
                    "Czechitas z. s.",
                    "Jungmannova 3",
                    "77900 Olomouc",
                    "cejka@czechitas.cz",
                    "888888888",
                    "www.czechitas.cz"
            )
    );
    seznamVizitek.add(
            new Vizitka(
                    "Kateřina Reiglová",
                    "Czechitas z. s.",
                    "Lipová 1789/9",
                    "37005 České Budějovice",
                    "katka@seznam.cz",
                    "888888888",
                    "www.czechitas.cz"
            )
    );
  }
    public void append(Vizitka vizitka) {
        seznamVizitek.add(vizitka);
    }

    public void deleteById(int id) {
        seznamVizitek.remove(id);
    }

  public List<Vizitka> getAll() {
    return seznamVizitek;
  }

  public Vizitka getById(int id) {
    return seznamVizitek.get(id);
  }

    public void edit(int id, Vizitka vizitka) {
        seznamVizitek.set(id, vizitka);
    }

    public String getUserDidntProvideParameterMessage() {
        return userDidntProvideParameterMessage;
    }

    public void addNewBusinessCard(Vizitka vizitka) {
        seznamVizitek.add(vizitka);
    }
}
