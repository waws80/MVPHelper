package thanatos.mvphelper.MVPViewUtils;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import thanatos.mvphelper.R;

/**
 * Created by Administrator on 2016/11/28.
 */

public class MVPProgressBar extends ProgressDialog {
    public MVPProgressBar(Context context) {
        this(context, R.style.mvp_loading_dialog);
        setCanceledOnTouchOutside(false);
    }

    public MVPProgressBar(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressdialog_mvp);

    }
}
