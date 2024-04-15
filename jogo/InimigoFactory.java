public class InimigoFactory {
    
    public Inimigo criarInimigo(String regiao){
        switch (regiao.toLowerCase()) {
            case "amazonia":
                return new AnimaisMutantes();
            case "sertao":
                return new Cangaceiro();
            case "rio de janeiro":
                return new Criminosos();
            default:
                throw new IllegalArgumentException("Localização desconhecida: " + regiao);
        }
    }
}