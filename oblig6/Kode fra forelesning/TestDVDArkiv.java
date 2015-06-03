
class TestDVDArkiv {
    public static void main(String[] arg) throws Exception  {
	DVDArkiv a = new DVDArkiv("dvd-arkiv.text");

	a.lesArkiv();
	a.utfoerKommandoer();
	a.skrivArkiv();
    }
}
