package com.gvrk.tweetitsweet.CustomViews;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.WindowManager;

import com.gvrk.tweetitsweet.R;

public class ProgressDialog extends Dialog {

    public ProgressDialog(Context context) {
        super(context);
    }

    private ProgressDialog(Context context, int theme) {
        super(context, theme);
    }

    public static ProgressDialog show(Context context, boolean cancelable,
                                      OnCancelListener cancelListener) {
        ProgressDialog dialog = new ProgressDialog(context, R.style.Progress);
        dialog.setContentView(R.layout.progress_hud);
        dialog.setCancelable(cancelable);
        dialog.setOnCancelListener(cancelListener);
        dialog.getWindow().getAttributes().gravity = Gravity.CENTER;
        WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
        lp.dimAmount = 0.2f;
        dialog.getWindow().setAttributes(lp);
        dialog.show();
        return dialog;
    }
}
