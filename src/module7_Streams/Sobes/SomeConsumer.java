package module7_Streams.Sobes;

import java.util.List;
import java.util.stream.Collectors;

public class SomeConsumer {
    //Получить список пользователей, которые состоят хотябы в одной группе нназвание которой начинается на "Х"
    public static List<User> userList(List<User> users){
        return users.stream().
                filter(u -> u.getGroups().stream().anyMatch(group -> group.getName().startsWith("X")))
                .collect(Collectors.toList());
    }
}
