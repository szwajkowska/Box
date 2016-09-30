public class Box {

    private double boxVolume;
    private Box centre;
    private int a = 5;

    public Box() {
        this.boxVolume = a * a * a;

    }

    public Box(int side) {
        this.boxVolume = side * side * side;

    }

    public double getBOxVolume() {
        return boxVolume;
    }

    public Box getCentre() {
        return centre;
    }

    public void putBox(Box innerBox) {
        if (innerBox.boxVolume < boxVolume && isEmpty()) {
            centre = innerBox;
            System.out.println("Umieszczono pudełko  w pudełku");
        } else {
            System.out.println("Nie umieszczono pudełka w pudełku. Pudełko wewnętrzne jest zbyt duże");
        }

    }

    public Box getBox() {
        return centre;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Pudełko o objętości: " + boxVolume;
        }
        return "Pudełko o objętośći " + boxVolume + " ma w sobie pudełko o objętośći " + centre.boxVolume;
    }

    private boolean isEmpty() {
        if (centre == null) {
            return true;
        }
        return false;
    }

    public void putBox(int side) {
        Box box = new Box(side);
        this.putBox(box);
    }

    public Box removeBox() {
        Box innerBox = centre;
        if (centre != null) {
            centre = null;
            System.out.println("Usunięto pudelko wewnetrzne");
        }
        return innerBox;
    }

    public Box replaceBox(Box newBox) {
        Box oldCentre = centre;
        if (isEmpty()) {
            putBox(newBox);
            return oldCentre;
        }
        else if (newBox !=null && !isEmpty()){
            if (newBox.boxVolume < boxVolume && newBox.boxVolume > centre.centre.boxVolume && !centre.isEmpty()){
                newBox.putBox(centre.centre);
                centre = newBox;

                System.out.println("Wymieniono pudełko");
            }
        }
        return oldCentre;
    }
}



