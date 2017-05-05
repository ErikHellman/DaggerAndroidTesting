package se.hellsoft.daggertesting;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;


public class StartFragment extends Fragment {
  @Inject
  StartPresenter startPresenter;

  public StartFragment() {
  }

  @Override
  public void onAttach(Context context) {
    AndroidSupportInjection.inject(this);
    super.onAttach(context);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_start, container, false);
    ((TextView) view.findViewById(R.id.text)).setText(startPresenter.getText());
    return view;
  }

}
