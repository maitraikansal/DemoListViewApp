package traveller_list;

import java.util.ArrayList;

public class PlaceData {

  public static String[] placeNameArray = {"Bora Bora", "Canada", "Dubai", "Hong Kong", "Iceland", "India", "Kenya", "London", "Switzerland", "Sydney"};
  public static String[] placeImgNameArray = {"borabora", "canada", "dubai", "hongkong", "iceland", "india", "kenya", "london", "switzerland", "sydney"};

  public static ArrayList<Place> placeList() {
    ArrayList<Place> list = new ArrayList<>();
    for (int i = 0; i < placeNameArray.length; i++) {
      Place place = new Place();
      place.name = placeNameArray[i];
      place.imageName = placeImgNameArray[i];
      if (i == 2 || i == 5) {
        place.isFav = true;
      }
      list.add(place);
    }
    return (list);
  }
}
