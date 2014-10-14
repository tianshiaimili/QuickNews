//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.tiger.quicknews.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tiger.quicknews.R.id;
import com.tiger.quicknews.R.layout;
import com.tiger.quicknews.wedget.ProgressPieView;
import com.tiger.quicknews.wedget.htmltextview.HtmlTextView;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class DetailsActivity_
    extends DetailsActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_details);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        init();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static DetailsActivity_.IntentBuilder_ intent(Context context) {
        return new DetailsActivity_.IntentBuilder_(context);
    }

    public static DetailsActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new DetailsActivity_.IntentBuilder_(fragment);
    }

    public static DetailsActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new DetailsActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        imgCount = ((TextView) hasViews.findViewById(id.img_count));
        newTitle = ((TextView) hasViews.findViewById(id.new_title));
        webView = ((HtmlTextView) hasViews.findViewById(id.wb_details));
        mProgressPieView = ((ProgressPieView) hasViews.findViewById(id.progressPieView));
        mPlay = ((ImageView) hasViews.findViewById(id.play));
        newTime = ((TextView) hasViews.findViewById(id.new_time));
        newImg = ((ImageView) hasViews.findViewById(id.new_img));
        {
            View view = hasViews.findViewById(id.new_img);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DetailsActivity_.this.imageMore(view);
                    }

                }
                );
            }
        }
        initWebView();
    }

    @Override
    public void getResult(final String result) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                DetailsActivity_.super.getResult(result);
            }

        }
        );
    }

    @Override
    public void loadNewDetailData(final String url) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    DetailsActivity_.super.loadNewDetailData(url);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, DetailsActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            fragment_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, DetailsActivity_.class);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, DetailsActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public DetailsActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent_, requestCode);
                } else {
                    if (context_ instanceof Activity) {
                        ((Activity) context_).startActivityForResult(intent_, requestCode);
                    } else {
                        context_.startActivity(intent_);
                    }
                }
            }
        }

    }

}
