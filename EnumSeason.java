public  enum EnumSeason{
    SPRING,SUMMER,FALL,WINTER;
}
class EnumTest{
    public static void main(String[] args) {
        for(EnumSeason season:EnumSeason.values()){
            System.out.println(season);
        }
        System.out.println();
    }
}