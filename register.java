<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/iris"
        android:orientation="horizontal"
        tools:layout_editor_asoluteX="30dp">

        <ImageView
            android:id="@+id/imageview1"
            android:layout_width="100dp"
            android:layout_height="match_parent"
            android:layout_centerInParent="true">

        </ImageView>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="10dp"
            android:layout_marginTop="10dp"
            android:text="Register Now"
            android:textColor="@color/white"
            android:textSize="40dp"
            android:textStyle="bold"
            android:typeface="serif">

        </TextView>


    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="731dp"
        android:orientation="vertical">

        <ImageView
            android:id="@+id/imageview2"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:layout_centerInParent="true"
            android:layout_marginLeft="140dp"
            android:layout_marginTop="10dp">

        </ImageView>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="136dp"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="Full Name:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <EditText
                android:layout_width="270dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:hint="Enter Your Full Name">

            </EditText>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="139dp"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="User Name:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <EditText
                android:layout_width="271dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:hint="Enter Your User Name">

            </EditText>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="138dp"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="Password:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <EditText
                android:layout_width="270dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:hint="Enter Your Password"
                android:inputType="textPassword">

            </EditText>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="131dp"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="Gender:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <RadioButton
                android:layout_width="117dp"
                android:layout_height="wrap_content"
                android:text="Male"
                android:textColor="@color/iris"
                android:textSize="20dp">

            </RadioButton>

            <RadioButton
                android:layout_width="138dp"
                android:layout_height="wrap_content"
                android:text="Female"
                android:textColor="@color/iris"
                android:textSize="20dp">

            </RadioButton>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="133dp"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="Mobile No:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <EditText
                android:layout_width="272dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:hint="Enter Your Mobile No"
                android:inputType="number">

            </EditText>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="Per.Address:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <EditText
                android:layout_width="267dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:hint=" Enter Permanent Address">

            </EditText>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="Alt.Address:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <EditText
                android:layout_width="273dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:hint="Enter Alternative Address">

            </EditText>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="98dp"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="City:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <EditText
                android:layout_width="273dp"
                android:layout_height="wrap_content"
                android:layout_marginTop="10dp"
                android:hint="Enter Your City ">

            </EditText>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="60dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="97dp"
                android:layout_height="30dp"
                android:layout_marginLeft="5dp"
                android:layout_marginTop="10dp"
                android:text="State:->"
                android:textColor="@color/iris"
                android:textSize="20dp"
                android:typeface="serif"></TextView>

            <Spinner
                android:id="@+id/spinner"
                android:layout_width="246dp"
                android:layout_height="40dp"
                android:background="@color/white">

            </Spinner>


        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="59dp"
            android:orientation="horizontal">

            <Button
                android:layout_width="157dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="20dp"
                android:background="@color/iris"
                android:text="Register"
                android:textColor="@color/white"
                android:textSize="20dp"
                android:textStyle="bold">

            </Button>

            <Button
                android:layout_width="136dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="20dp"
                android:background="@color/iris"
                android:text="Cancel"
                android:textColor="@color/white"
                android:textSize="20dp"
                android:textStyle="bold">

            </Button>


        </LinearLayout>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="59dp"
            android:orientation="horizontal">

            <TextView
                android:layout_width="217dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="10dp"
                android:text="Do you have an Acount:->"
                android:textColor="@color/black"
                android:textSize="15dp"
                android:textStyle="italic">

            </TextView>

            <Button
                android:layout_width="130dp"
                android:layout_height="wrap_content"
                android:layout_marginLeft="20dp"
                android:background="@color/iris"
                android:text="Login "
                android:textColor="@color/white"
                android:textSize="20dp"
                android:textStyle="bold">

            </Button>


        </LinearLayout>


    </LinearLayout>

</LinearLayout>
