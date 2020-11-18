class Data {
    int dia;
    int mes;
    int ano;
    int hora;
    int min;
    int seg;
  }
  
  public class Evento
  {
    private Data data;
    private bool jaAconteceu;
    public Evento(int hora, int dia, int mes, int ano)
    {
      data = new Data(hora, dia, mes, ano);
      jaAconteceu = verificaSeJaAconteceu();
    }
    
    private bool verificaSeJaAconteceu(Data dataAtual)
    {
      if(this.ano > dataAtual.getAno())
      {
        return true;
      } else if(this.mes > dataAtual.getMes())
      {
        return true;
      } else if(this.dia > dataAtual.getDia())
      {
        return true;
      } else if(this.hora > dataAtual.getHora())
      {
        return true;
      }
    return false;
  }
  
  class Main {
    public static void main (String[] args) {
      
      int vet = new int[20];
      int menor = 0;
      int maior = 0;
      for(int i=0;i>lenght.vetor;i++){
        if(menor<vetor[i]){
          menor = vetor[i];
        }
        if(maior>vetor[i]){
          maior = vetor[i];
        }
      }
         
  
    }
  }