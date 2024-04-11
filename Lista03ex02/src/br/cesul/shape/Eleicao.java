package br.cesul.shape;

public class Eleicao {
    private double numVotosA;
    private double numVotosB;
    private double numVotosBrancos;
    private double numVotosNulos;


    public Eleicao(double numVotosA, double numVotosB, double numVotosBrancos, double numVotosNulos) {
        this.numVotosA = numVotosA;
        this.numVotosB = numVotosB;
        this.numVotosBrancos = numVotosBrancos;
        this.numVotosNulos = numVotosNulos;
    }

    public String votacaoApurada() {
        double totalVotos = numVotosA + numVotosB;

        if (numVotosA >= ((totalVotos/2) + 1)) {
            return "Candidato A eleito!";
        } else if (numVotosB >= ((totalVotos / 2) + 1)) {
            return "Candidato B eleito!";
        } else {
            return "Votação terá segundo turno!";
        }
    }


    public double getNumVotosA() {
        return numVotosA;
    }

    public double getNumVotosB() {
        return numVotosB;
    }

    public double getNumVotosBrancos() {
        return numVotosBrancos;
    }

    public double getNumVotosNulos() {
        return numVotosNulos;
    }
}

