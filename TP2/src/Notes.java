public class Notes {
    private double note;
    private Etudiant e;
    private Unite u;

    Notes(double note,Etudiant e,Unite u) {
        this.note = note;
        this.e = e;
        this.u = u;
    }

    public String toString() {
        return e.toString() + " a une note : "+ this.note + "dans " + u.toString();
    }
}
