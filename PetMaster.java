public class PetMaster {

  public static void main(String[] args) {

    String petReaction;
    Pet myPet = new Pet();
    myPet.eat();

    petReaction = myPet.talk("Tweet!! Tweet!!");

    System.out.println(petReaction);
    myPet.sleep();
  }
}
