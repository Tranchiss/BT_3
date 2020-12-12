package com.example.test3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import category.Category;
import category.CategoryAdapter;
import shop.Shop;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    ImageView img;
    ImageView img1;
    ImageView img2;
    ImageView img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img = (ImageView) findViewById(R.id.anh1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(MainActivity.this, tichdiem.class);
                startActivity(intent);
            }
        });

        img1 = (ImageView) findViewById(R.id.anh2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dathang.class);
                startActivity(intent);
            }
        });

        img2 = (ImageView) findViewById(R.id.anh3);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, taikhoan.class);
                startActivity(intent);
            }
        });

        img3 = (ImageView) findViewById(R.id.anh4);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Uu_dai.class);
                startActivity(intent);
            }
        });

        //BottomNavigation di chuyển giữa các layout
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.tintuc);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dathang:
                        startActivity(new Intent(getApplicationContext(), dathang.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.cuahang:
                        startActivity(new Intent(getApplicationContext(), cuahang.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.taikhoan:
                        startActivity(new Intent(getApplicationContext(), taikhoan.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.tintuc:
                        return true;
                }
                return false;
            }
        });

        //RecyclerView
        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
        rcvCategory.setAdapter(categoryAdapter);

    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();
        List<Shop> listShop = new ArrayList<>();
        List<Shop> listShop1 = new ArrayList<>();
        List<Shop> listShop2 = new ArrayList<>();
        listShop.add(new Shop(R.drawable.h9, "Giảm 50%, thèm gì gọi nhé Nhà mang tới liền nè Hòa vào không khí siêu sale cuối năm,  gọi món yêu thích....."));
        listShop.add(new Shop(R.drawable.h10, "Nhà mời cà phê đậm đà, chỉ 12k Tuần mưới chỉ thật sự tươi khi có một tách cà phê đậm dà kề bên...."));
        listShop.add(new Shop(R.drawable.h11, "Nhà mời 20%, PICKUP nha Trải nghiệm ngay tính năng PICKUP của nhà với ưu đãi giảm 20% cho đờn hàng..."));
        listShop.add(new Shop(R.drawable.h13, "Bánh ngon nhà mời, chỉ 19.0000đ! Cuối năm bận rộn thi cử chạy số, nhưng không được bỏ bữa"));
        listShop.add(new Shop(R.drawable.h14, "Team Hà Nội gọi ccombo trà mát Nhận ngay ly nhực 2 lớp xiijn sò phiên bản Nắng Vàng(Quả dứa)...."));
        listShop.add(new Shop(R.drawable.h15, "Mua 3 Tặng 1 - mời Nhóm mình chung vui Chỉ cần nhập mã CUNGVUI qua app, Nhà mời ngay ưu đãi mua 3 tặng 1...."));
        listShop.add(new Shop(R.drawable.h16, "Nhà mời cà phê đậm đà, chỉ 12k Tuần mưới chỉ thật sự tươi khi có một tách cà phê đậm dà kề bên...."));

        listShop1.add(new Shop(R.drawable.h17, "Nhà Reverside Vũ Tông Phan - Hà Nội vui khai trương người ta dậy thì thành công, thì nhớ mang chiếc áo đủ ấm..."));
        listShop1.add(new Shop(R.drawable.h18, "Taste of Xmas - Chạm vị Giáng Sinh Năm nay tại nhà, vị giáng sinh mà bạn yêu thích, mong chờ từ trước đến nay vãn vậy... "));
        listShop1.add(new Shop(R.drawable.h19, "Trời se lạnh, thưởng thức ngay những món nóng của chớm dông, những cơn mưa bất chợt làm se lạnh...."));
        listShop1.add(new Shop(R.drawable.h20, "Taste of Xmas - Chạm vị Giáng Sinh Năm nay tại nhà, vị giáng sinh mà bạn yêu thích, mong chờ từ trước đến nay vãn vậy... "));
        listShop1.add(new Shop(R.drawable.h21, "Trời se lạnh, thưởng thức ngay những món nóng của chớm dông, những cơn mưa bất chợt làm se lạnh...."));
        listShop1.add(new Shop(R.drawable.h22, "Trời se lạnh, thưởng thức ngay những món nóng của chớm dông, những cơn mưa bất chợt làm se lạnh...."));
        listShop1.add(new Shop(R.drawable.h23, "Taste of Xmas - Chạm vị Giáng Sinh Năm nay tại nhà, vị giáng sinh mà bạn yêu thích, mong chờ từ trước đến nay vãn vậy... "));
        listShop1.add(new Shop(R.drawable.h24, "Nhà Reverside Vũ Tông Phan - Hà Nội vui khai trương người ta dậy thì thành công, thì nhớ mang chiếc áo đủ ấm..."));
        listShop1.add(new Shop(R.drawable.h19, "Taste of Xmas - Chạm vị Giáng Sinh Năm nay tại nhà, vị giáng sinh mà bạn yêu thích, mong chờ từ trước đến nay vãn vậy... "));
        listShop1.add(new Shop(R.drawable.h17, "Nhà Reverside Vũ Tông Phan - Hà Nội vui khai trương người ta dậy thì thành công, thì nhớ mang chiếc áo đủ ấm..."));


        listShop2.add(new Shop(R.drawable.h13, "Bản sắc nơi đất trồng, Một Hành trình tìm về ...... cùng nhà bắt đầu hành trình đầu tiên cùng Travel blogger nhị Đặng lên đường"));
        listShop2.add(new Shop(R.drawable.h14, "Cảm ơn bạn, vì luôn là 1 bản nguyên khác biệt...Tạo khác biệt từ chất nguyên bản thước phim khác biệt "));
        listShop2.add(new Shop(R.drawable.h24, "Hương vị cà phê mới tại nhà Signsture nhà hàng Signature - nơi những hương vị nguyên bản của tạo nên trải nghiệm khác biệt..."));
        listShop2.add(new Shop(R.drawable.h17, "Bản sắc nơi đất trồng, Một Hành trình tìm về ...... cùng nhà bắt đầu hành trình đầu tiên cùng Travel blogger nhị Đặng lên đường"));
        listShop2.add(new Shop(R.drawable.h21, "Cảm ơn bạn, vì luôn là 1 bản nguyên khác biệt...Tạo khác biệt từ chất nguyên bản thước phim khác biệt "));
        listShop2.add(new Shop(R.drawable.h18, "Hương vị cà phê mới tại nhà Signsture nhà hàng Signature - nơi những hương vị nguyên bản của tạo nên trải nghiệm khác biệt..."));
        listShop2.add(new Shop(R.drawable.h23, "Bản sắc nơi đất trồng, Một Hành trình tìm về ...... cùng nhà bắt đầu hành trình đầu tiên cùng Travel blogger nhị Đặng lên đường"));
        listShop2.add(new Shop(R.drawable.h22, "Cảm ơn bạn, vì luôn là 1 bản nguyên khác biệt...Tạo khác biệt từ chất nguyên bản thước phim khác biệt "));
        listShop2.add(new Shop(R.drawable.h21, "Hương vị cà phê mới tại nhà Signsture nhà hàng Signature - nơi những hương vị nguyên bản của tạo nên trải nghiệm khác biệt..."));

        listCategory.add(new Category("Ưu đãi đặc biệt", listShop));
        listCategory.add(new Category("Cập nhật từ nhà", listShop1));
        listCategory.add(new Category("#CoffeeLover", listShop2));

        return listCategory;

    }
}