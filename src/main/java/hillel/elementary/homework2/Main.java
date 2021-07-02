package hillel.elementary.homework2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InitializationData initializationData = new InitializationData();
        Information information = initializationData.fillTheData();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(78);
        arrayList.add(3);
        arrayList.add(8);

        Information newInfo = additionStrings(arrayList, information);

        System.out.println("Email set size: " + newInfo.getEmailSet().size());
        System.out.println("Email-Nickname map size: " + newInfo.getEmailNicknameMap().size());
        System.out.println("Nickname list size " + newInfo.getNicknameList().size());
    }

    public static Information additionStrings(List<? extends Number> numberList, Information info) {
        Map<String, String> newEmailNicknameMap = info.getEmailNicknameMap();
        Set<String> newEmailSet = info.getEmailSet();
        List<String> newNicknameList = info.getNicknameList();

        for (int i = 0; i < numberList.size(); i++) {
            String nickname = String.valueOf(numberList.get(i));

            newNicknameList.add(nickname);
            newEmailSet.add(nickname + "@mail.ua");
            newEmailNicknameMap.put(nickname + "@mail.ua", nickname);
        }

        Set<String> nicknameSet = new HashSet<>(newNicknameList);
        newNicknameList.clear();
        nicknameSet.addAll(newNicknameList);
        newNicknameList.addAll(nicknameSet);

        info.setNicknameList(newNicknameList);
        info.setEmailSet(newEmailSet);
        info.setEmailNicknameMap(newEmailNicknameMap);
        return info;
    }
}
