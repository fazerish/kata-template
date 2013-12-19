package no.finntech.kata;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public final class JulenissensTellealvTest {
    
    @Test
    public void exampleUsingJunitAssertion() {
        org.junit.Assert.assertEquals(JulenissensTellealv.sum(1, 2, 3), 6);
    }
    
    @Test
    public void exampleUsingHamcrestAssert() {
        org.hamcrest.MatcherAssert.assertThat(JulenissensTellealv.sum(1, 2, 3), org.hamcrest.CoreMatchers.is(6));
    }
    
    @Test
    public void exampleUsingFestAssert() {
        assertThat(JulenissensTellealv.sum(1, 2, 3)).isEqualTo(6);
    }

    @Test
    public void sifferFraNullTilNiSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(0)).isEqualTo("null");
        assertThat(JulenissensTellealv.somTallord(1)).isEqualTo("en");
        assertThat(JulenissensTellealv.somTallord(2)).isEqualTo("to");
        assertThat(JulenissensTellealv.somTallord(3)).isEqualTo("tre");
        assertThat(JulenissensTellealv.somTallord(4)).isEqualTo("fire");
        assertThat(JulenissensTellealv.somTallord(5)).isEqualTo("fem");
        assertThat(JulenissensTellealv.somTallord(6)).isEqualTo("seks");
        assertThat(JulenissensTellealv.somTallord(7)).isEqualTo("syv");
        assertThat(JulenissensTellealv.somTallord(8)).isEqualTo("åtte");
        assertThat(JulenissensTellealv.somTallord(9)).isEqualTo("ni");
    }

    @Test
    public void tallFraTiTilNittenSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(10)).isEqualTo("ti");
        assertThat(JulenissensTellealv.somTallord(11)).isEqualTo("elleve");
        assertThat(JulenissensTellealv.somTallord(12)).isEqualTo("tolv");
        assertThat(JulenissensTellealv.somTallord(13)).isEqualTo("tretten");
        assertThat(JulenissensTellealv.somTallord(14)).isEqualTo("fjorten");
        assertThat(JulenissensTellealv.somTallord(15)).isEqualTo("femten");
        assertThat(JulenissensTellealv.somTallord(16)).isEqualTo("seksten");
        assertThat(JulenissensTellealv.somTallord(17)).isEqualTo("sytten");
        assertThat(JulenissensTellealv.somTallord(18)).isEqualTo("atten");
        assertThat(JulenissensTellealv.somTallord(19)).isEqualTo("nitten");
    }

    @Test
    public void tallFraTjueTilTjueniSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(20)).isEqualTo("tjue");
        assertThat(JulenissensTellealv.somTallord(21)).isEqualTo("tjueen");
        assertThat(JulenissensTellealv.somTallord(22)).isEqualTo("tjueto");
        assertThat(JulenissensTellealv.somTallord(23)).isEqualTo("tjuetre");
        assertThat(JulenissensTellealv.somTallord(24)).isEqualTo("tjuefire");
        assertThat(JulenissensTellealv.somTallord(25)).isEqualTo("tjuefem");
        assertThat(JulenissensTellealv.somTallord(26)).isEqualTo("tjueseks");
        assertThat(JulenissensTellealv.somTallord(27)).isEqualTo("tjuesyv");
        assertThat(JulenissensTellealv.somTallord(28)).isEqualTo("tjueåtte");
        assertThat(JulenissensTellealv.somTallord(29)).isEqualTo("tjueni");
    }

    @Test
    public void tallFraTrettiTilNittiniSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(30)).isEqualTo("tretti");
        assertThat(JulenissensTellealv.somTallord(41)).isEqualTo("førtien");
        assertThat(JulenissensTellealv.somTallord(52)).isEqualTo("femtito");
        assertThat(JulenissensTellealv.somTallord(63)).isEqualTo("sekstitre");
        assertThat(JulenissensTellealv.somTallord(74)).isEqualTo("syttifire");
        assertThat(JulenissensTellealv.somTallord(85)).isEqualTo("åttifem");
        assertThat(JulenissensTellealv.somTallord(96)).isEqualTo("nittiseks");
    }

    @Test
    public void tallFraHundreTilNihundreognittiniSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(100)).isEqualTo("etthundre");
        assertThat(JulenissensTellealv.somTallord(101)).isEqualTo("etthundreogen");
        assertThat(JulenissensTellealv.somTallord(210)).isEqualTo("tohundreogti");
        assertThat(JulenissensTellealv.somTallord(322)).isEqualTo("trehundreogtjueto");
        assertThat(JulenissensTellealv.somTallord(433)).isEqualTo("firehundreogtrettitre");
        assertThat(JulenissensTellealv.somTallord(544)).isEqualTo("femhundreogførtifire");
        assertThat(JulenissensTellealv.somTallord(655)).isEqualTo("sekshundreogfemtifem");
        assertThat(JulenissensTellealv.somTallord(766)).isEqualTo("syvhundreogsekstiseks");
        assertThat(JulenissensTellealv.somTallord(877)).isEqualTo("åttehundreogsyttisyv");
        assertThat(JulenissensTellealv.somTallord(988)).isEqualTo("nihundreogåttiåtte");
        assertThat(JulenissensTellealv.somTallord(999)).isEqualTo("nihundreognittini");
    }

    @Test
    public void tallFraTusenTilNitusennihundreognittiniSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(1000)).isEqualTo("ettusen");
        assertThat(JulenissensTellealv.somTallord(1001)).isEqualTo("ettusenogen");
        assertThat(JulenissensTellealv.somTallord(2109)).isEqualTo("totusenetthundreogni");
        assertThat(JulenissensTellealv.somTallord(3228)).isEqualTo("tretusentohundreogtjueåtte");
        assertThat(JulenissensTellealv.somTallord(4337)).isEqualTo("firetusentrehundreogtrettisyv");
        assertThat(JulenissensTellealv.somTallord(5446)).isEqualTo("femtusenfirehundreogførtiseks");
        assertThat(JulenissensTellealv.somTallord(6555)).isEqualTo("sekstusenfemhundreogfemtifem");
        assertThat(JulenissensTellealv.somTallord(7664)).isEqualTo("syvtusensekshundreogsekstifire");
        assertThat(JulenissensTellealv.somTallord(8773)).isEqualTo("åttetusensyvhundreogsyttitre");
        assertThat(JulenissensTellealv.somTallord(9882)).isEqualTo("nitusenåttehundreogåttito");
    }

    @Test
    public void tallFraTitusenTilNihundretusennihundreognittiniSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(10000)).isEqualTo("titusen");
        assertThat(JulenissensTellealv.somTallord(10001)).isEqualTo("titusenogen");
        assertThat(JulenissensTellealv.somTallord(22109)).isEqualTo("tjuetotusenetthundreogni");
        assertThat(JulenissensTellealv.somTallord(33228)).isEqualTo("trettitretusentohundreogtjueåtte");
        assertThat(JulenissensTellealv.somTallord(44337)).isEqualTo("førtifiretusentrehundreogtrettisyv");
        assertThat(JulenissensTellealv.somTallord(55446)).isEqualTo("femtifemtusenfirehundreogførtiseks");
        assertThat(JulenissensTellealv.somTallord(66555)).isEqualTo("sekstisekstusenfemhundreogfemtifem");
        assertThat(JulenissensTellealv.somTallord(77664)).isEqualTo("syttisyvtusensekshundreogsekstifire");
        assertThat(JulenissensTellealv.somTallord(88773)).isEqualTo("åttiåttetusensyvhundreogsyttitre");
        assertThat(JulenissensTellealv.somTallord(99882)).isEqualTo("nittinitusenåttehundreogåttito");
        assertThat(JulenissensTellealv.somTallord(999882)).isEqualTo("nihundreognittinitusenåttehundreogåttito");
    }

    @Test
    public void tallFraEnMillionTilNihundreognittiniMillionerSkalSkrivesSomTallord() {
        assertThat(JulenissensTellealv.somTallord(1000000)).isEqualTo("enmillion");
        assertThat(JulenissensTellealv.somTallord(1000001)).isEqualTo("enmillionogen");
        assertThat(JulenissensTellealv.somTallord(1000011)).isEqualTo("enmillionogelleve");
        assertThat(JulenissensTellealv.somTallord(5000011)).isEqualTo("femmillionerogelleve");
        assertThat(JulenissensTellealv.somTallord(6000111)).isEqualTo("seksmillioneretthundreogelleve");
        assertThat(JulenissensTellealv.somTallord(987345678)).isEqualTo("nihundreogåttisyvmillionertrehundreogførtifemtusensekshundreogsyttiåtte");
    }

    @Test
    public void milliardtesten() {
        assertThat(JulenissensTellealv.somTallord(1000000000)).isEqualTo("enmilliard");
        assertThat(JulenissensTellealv.somTallord(1000000001)).isEqualTo("enmilliardogen");
        assertThat(JulenissensTellealv.somTallord(1000000011)).isEqualTo("enmilliardogelleve");
        assertThat(JulenissensTellealv.somTallord(2000000211)).isEqualTo("tomilliardertohundreogelleve");
        assertThat(JulenissensTellealv.somTallord(2147483647)).isEqualTo("tomilliarderetthundreogførtisyvmillionerfirehundreogåttitretusensekshundreogførtisyv");
    }

    @Test
    public void denNegativeTesten() {
        assertThat(JulenissensTellealv.somTallord(-1)).isEqualTo("minusen");
        assertThat(JulenissensTellealv.somTallord(-11)).isEqualTo("minuselleve");
        assertThat(JulenissensTellealv.somTallord(-111)).isEqualTo("minusetthundreogelleve");
        assertThat(JulenissensTellealv.somTallord(-2147483648)).isEqualTo("minustomilliarderetthundreogførtisyvmillionerfirehundreogåttitretusensekshundreogførtiåtte");

    }
}
