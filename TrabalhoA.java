class Data {
  private int dia;
  private int mes;
  private int ano;
  private int hora;
  private int min;
  private int seg;

  public Data(int min, int hora, int dia, int mes, int ano)
  {
    this.min = setMin(min);
    this.hora = setHora(hora);
    this.dia = setDia(dia);
    this.mes = setMes(mes);
    this.ano = setAno(ano);
  }  

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
    else
      System.out.println("Insira um dia válido!");
  }

  public int getMes()
  {
    return mes;
  }

  public void setMes(int mes)
  {
    if(mes < 12)
      this.mes = mes;
    else
      System.out.println("Insira um mês válido!");
  }

  public int getAno()
  {
    return ano;
  }

  public void setAno(int ano)
  {
    if(ano > 0)
      this.ano = ano;
    else
      System.out.println("Insira um ano válido!");
  }

  public int getHora()
  {

      return hora;
  }

  public void setHora(int hora)
  {
    if(hora < 12 && hora >= 0)
      this.hora = hora;
    else
      System.out.println("Insira uma hora válida!");
  }
  
  public int getMin()
  {
    return min;
  }

  public void setMin(int min)
  {
    if(min < 60 && min > 0)
      this.min = min;
    else
      System.out.println("Insira um minuto válido!");
  }

    public int getSeg()
  {
    return seg;
  }

  public void setSeg(int seg)
  {
    if(seg < 60)
      this.seg = seg;
    else
      System.out.println("Insira um segundo válido!");
  }
  public int diferenca(Data x)
  {
    int soma = 0;
    soma = this.seg - x.seg;
    soma += (this.min - x.min)*60;
    soma += (this.hora - x.hora)*3600;
    soma += (this.dia - x.dia)*3600*24;
    return soma;
  }

  public boolAM()
  {
    return hora < 12;
  }

  public boolPM()
  {
    return hora >= 12;
  }
}
