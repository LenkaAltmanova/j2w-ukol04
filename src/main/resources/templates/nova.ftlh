[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="newBusinessCard">
    <h2 class="mt-5 mb-3">Formulář pro novou vizitku</h2>
    <form class="novaVizitka" method="post" action="/nova">
        <div class="form-group">
            <label for="jmenoAPrijmeni">Jméno a příjmení</label>
            <input id="jmenoAPrijmeni" name="jmeno" type="text" class="form-control" value="">
        </div>
        <div class="form-group">
            <label for="firma">Firma</label>
            <input id="firma" name="firma" type="text" class="form-control" value="">
        </div>
        <div class="form-group">
            <label for="ulice">Ulice</label>
            <input id="ulice" name="ulice" type="text" class="form-control" value="">
        </div>
        <div class="form-group">
            <label for="obecPsc">Obec a PSČ</label>
            <input id="obecPsc" name="obecPsc" type="text" class="form-control" value="">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input id="email" name="email" type="text" class="form-control" value="">
        </div>
        <div class="form-group">
            <label for="telefon">Telefon</label>
            <input id="telefon" name="telefon" type="text" class="form-control" value="">
        </div>
        <div class="form-group">
            <label for="web">Web</label>
            <input id="web" name="web" type="text" class="form-control" value="">
        </div>
        <div class="col-md-1 align-self-end">
            <button type="submit" class=" edd-button btn btn-primary">
                <i class="bi bi-person-check-fill" role="img" aria-label="Append"></i></button>
        </div>
    </form>
    <nav>
        <a href="/">◂ zpět na seznam</a>
    </nav>
</div>
</body>
</html>