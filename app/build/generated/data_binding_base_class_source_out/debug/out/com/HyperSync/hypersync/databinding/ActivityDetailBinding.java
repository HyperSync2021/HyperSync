// Generated by view binder compiler. Do not edit!
package com.HyperSync.hypersync.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.HyperSync.hypersync.R;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final Button btnContinue;

  @NonNull
  public final EditText etMobileNumber;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final EditText txtFirstName;

  @NonNull
  public final EditText txtLastName;

  private ActivityDetailBinding(@NonNull LinearLayout rootView,
      @NonNull LottieAnimationView animationView, @NonNull Button btnContinue,
      @NonNull EditText etMobileNumber, @NonNull TextView textView4, @NonNull EditText txtFirstName,
      @NonNull EditText txtLastName) {
    this.rootView = rootView;
    this.animationView = animationView;
    this.btnContinue = btnContinue;
    this.etMobileNumber = etMobileNumber;
    this.textView4 = textView4;
    this.txtFirstName = txtFirstName;
    this.txtLastName = txtLastName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animation_view;
      LottieAnimationView animationView = ViewBindings.findChildViewById(rootView, id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.btnContinue;
      Button btnContinue = ViewBindings.findChildViewById(rootView, id);
      if (btnContinue == null) {
        break missingId;
      }

      id = R.id.etMobileNumber;
      EditText etMobileNumber = ViewBindings.findChildViewById(rootView, id);
      if (etMobileNumber == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.txtFirstName;
      EditText txtFirstName = ViewBindings.findChildViewById(rootView, id);
      if (txtFirstName == null) {
        break missingId;
      }

      id = R.id.txtLastName;
      EditText txtLastName = ViewBindings.findChildViewById(rootView, id);
      if (txtLastName == null) {
        break missingId;
      }

      return new ActivityDetailBinding((LinearLayout) rootView, animationView, btnContinue,
          etMobileNumber, textView4, txtFirstName, txtLastName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}