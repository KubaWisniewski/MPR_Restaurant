package wisniewski.jakub.domain.Checker;

import wisniewski.jakub.domain.MenuPosition;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Kuba on 29.11.2017.
 */
public class SortChecker {

    public boolean isSortValid(List<MenuPosition>lsMethod,List<MenuPosition>lsAll)
    {
        lsAll.sort(Comparator.comparing(MenuPosition::getPrice));
        return lsAll.equals(lsAll);
    }
}
