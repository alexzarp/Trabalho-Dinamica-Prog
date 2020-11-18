import java.util.List;

class Data {
  private int dia;
  private int mes;
  private int ano;
  private int hora;
  private int min;
  private int seg;

  public Data(int seg, int min, int hora, int dia, int mes, int ano)
  {
    this.seg = setSeg(seg);
    this.min = setMin(min);
    this.hora = setHora(hora);
    this.dia = setDia(dia);
    this.mes = setMes(mes);
    this.ano = setAno(ano);
  }  

  public int getDia()
  {
    return dia;
  }

  public void setDia(int dia)
  {
    if(dia < 31)
      this.dia = dia;
  }

  public int getMes()
  {
    return mes;
  }

  public void setMes(int mes)
  {
    if(mes < 12)
      this.mes = mes;
  }

  public int getAno()
  {
    return ano;
  }

  public void setAno(int ano)
  {
    if(ano > 0)
      this.ano = ano;
  }

  public int getHora()
  {

      return hora;
  }

  public void setHora(int hora)
  {
    if(hora < 12 && hora > 0)
    this.hora = hora;
  }
  
  public int getMin()
  {
    return min;
  }

  public void setMin(int min)
  {
    if(min < 60 && min > 0)
      this.min = min;
  }

    public int getSeg()
  {
    return seg;
  }

  public void setSeg(int seg)
  {
    this.seg = seg;
  }
}

class TrabalhoA {
  public static void main (String[] args) {
      Data d1 = new Data(1, 4, 3, 14, 2019);
  }
}
