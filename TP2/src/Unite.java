public class Unite {
    private String titre ;
    private int coef ;

    Unite(String titre , int coef) {
        this.titre = titre ;
        this.coef = coef ;
    }

    public String toString() {
        return "Unité de titre : " + this.titre +" , " + "coefficient : " + this.coef   ;
    }


}
