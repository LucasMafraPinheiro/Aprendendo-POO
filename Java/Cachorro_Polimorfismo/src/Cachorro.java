public class Cachorro extends Lobo {
    @Override
    public void emitirSom(){
        System.out.println("Au!Au!Au!\n");
    }
    public void reagir(String frase){
        if(frase=="hora de comer" || frase =="Olá"){
            System.out.println("-abanar e latir-");
        }else{
            System.out.println("-rosnar-");
        }
    };
    public void reagir(int hora, int min){
        if(hora<12){
            System.out.println("-abanar-");
        }else if(hora>=18){
            System.out.println("-ignorar-");
        }else{
            System.out.println("-abanar e latir2-");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("-abanar dono-");
        }else{
            System.out.println("-rosnar nao dono-");
        }
    }
    public void reagir(int idade, float peso){
        if(idade<5){
            if(peso<10){
                System.out.println("-abanar jovem e leve-");
            }else{
                System.out.println("-latir jovem e pesado-");
            }
        }else{
            if(peso<10){
                System.out.println("-rosnar velho e leve-");
            }else{
                System.out.println("-ignorar velho e pesado-");
            }
        }
    }

}
