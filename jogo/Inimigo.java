public abstract class Inimigo {
    private String name;
    private String regiao;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    } 

    public void atacar(){
        System.out.println("Você foi atacado pelo " + name + " na(o) " + regiao);
    }
}