package com.poojab26.visualsearchtensorflow;


import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


import com.poojab26.visualsearchtensorflow.Fragments.CameraFragment;
import com.poojab26.visualsearchtensorflow.Fragments.ProductListFragment;
import com.poojab26.visualsearchtensorflow.Fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {

//    Toolbar toolbar;
    FloatingActionButton fabButtonOpenCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_bar);

        fabButtonOpenCamera = findViewById(R.id.fabClick2);
        fabButtonOpenCamera.setVisibility(View.VISIBLE);

        fabButtonOpenCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CameraFragment cameraFragment = new CameraFragment();
                MainActivity.this.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.search_bar, cameraFragment)
                        .commit();

                fabButtonOpenCamera.setVisibility(View.GONE);
            }
        });
//        toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle(getTitle());

//        ProductListFragment productListFragment = new ProductListFragment();
//        productListFragment.setTopResult("all");
//        SearchFragment searchFragment = new SearchFragment();

//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.activity_main, searchFragment)
//                .commit();

    }


}
