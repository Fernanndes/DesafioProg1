public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa todos os atributos e valida a data
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Alterando para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Método para validar a data
    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }

        return true;
    }

    // Método para obter a quantidade de dias no mês
    private int diasNoMes(int mes, int ano) {
        if (mes == 2) {
            return verificaAnoBissexto() ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    // Método para verificar se o ano é bissexto
    public boolean verificaAnoBissexto() {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    // Getters e Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
      // método compareTo para comparar duas datas
    public int compareTo(Data outraData) {
        if (this.ano < outraData.ano) {
            return -1;
        } else if (this.ano > outraData.ano) {
            return 1;
        } else {
            if (this.mes < outraData.mes) {
                return -1;
            } else if (this.mes > outraData.mes) {
                return 1;
            } else {
                if (this.dia < outraData.dia) {
                    return -1;
                } else if (this.dia > outraData.dia) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }


    // Método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
