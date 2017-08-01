package management.web.service.impl;

import management.web.service.Doubler;

public class DoublerImpl implements Doubler {
    public int doubleIt(int toDouble) {
        return toDouble * 2;
    }
}
