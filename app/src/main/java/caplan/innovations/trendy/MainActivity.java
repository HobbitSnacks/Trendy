package caplan.innovations.trendy;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

/**
 * Created by Corey on 1/19/2017.
 * Project: Trendy
 * <p></p>
 * Purpose of Class:
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @LayoutRes
    @Override
    int getContentView() {
        return R.layout.activity_main;
    }

}
