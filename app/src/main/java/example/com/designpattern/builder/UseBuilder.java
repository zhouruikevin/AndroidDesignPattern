package example.com.designpattern.builder;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Notification;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;

import example.com.designpattern.R;

/**
 * Created by Administrator on 2016/8/9.
 */
public class UseBuilder {
    private Context mContext;

    public void testAlertDialog() {
//        Most Android System Dialog use Builder pattern
//        mContext donot use Application Context,use Activity Context
//        otherwise，throw bad token context runtime exception
        new AlertDialog.Builder(mContext)
                .setTitle("Title")
                .setMessage("content message")
                .setPositiveButton("Positive Button", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //positive button do something...
                    }
                })
                .create()
                .show();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void tesNotification() {
        Notification.Builder builder = new Notification.Builder(mContext);
        builder.setContentText("notification content text")
                .setLargeIcon(BitmapFactory.decodeResource(mContext.getResources(), R.drawable.pause_img))
                .setShowWhen(true)
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();
    }
}
