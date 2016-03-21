package bubal.tnote.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import bubal.tnote.fragment.CurrentTaskFragment;
import bubal.tnote.fragment.DoneTaskFragment;

//import bubal.tnote.fragment.CurrentTaskFragment;

public class TabAdapter extends FragmentStatePagerAdapter {

    private int number_of_tabs;

    public static final int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static final int DONE_TASK_FRAGMENT_POSITION = 1;

    private CurrentTaskFragment currentTaskFragment;
    private DoneTaskFragment doneTaskFragment;

    public TabAdapter(FragmentManager fm, int number_of_tabs) {
        super(fm);
        this.number_of_tabs = number_of_tabs;
        currentTaskFragment = new CurrentTaskFragment();
        doneTaskFragment = new DoneTaskFragment();
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return currentTaskFragment;
            case 1:
                return doneTaskFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return number_of_tabs;
    }
}
