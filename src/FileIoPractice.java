import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {

    public static void main(String[] args) throws IOException {

        Path pathToPeople = Paths.get("fileIo", "people.txt");
//        System.out.println(pathToPeople);


        List<String> peopleList = Files.readAllLines(pathToPeople);
//
//        for (int i = 0; i < peopleList.size(); i += 1) {
//            System.out.println(peopleList.get(i) + " works at Codeup.");
//        }

        List<String> name1 = new ArrayList<>(Arrays.asList("Emily", "Ann", "Sabrina", "Michael"));
        deleteEntry((ArrayList) name1);


//        List<String> newNames = Arrays.asList("Yasin", "Michael", "Emily", "Sabrina", "Ann");
//        try {
//            Files.write(pathToPeople, newNames);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }


    public static Path deleteEntry (ArrayList name){
        Path p = Paths.get("src/fileIo/people.txt");
        try {
            return Files.write(p, name);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return p;
    }



//    public static Path deleteEntry(ArrayList name) throws IOException {
//        Path pathToPeople = Paths.get("fileIo", "people.txt");
//        List<String> peopleList = Files.readAllLines(pathToPeople);
//        for (int i = 0; i < peopleList.size(); i += 1) {
//            if (peopleList.get(i).equalsIgnoreCase("Justin")) {
//                List<String> names = new ArrayList<>();
//                names.add("Casey");
//                names.add("Ry");
//                names.add("David");
//                try {
//                    Files.write(pathToPeople, names, StandardOpenOption.APPEND);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//    }

}
