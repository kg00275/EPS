package com.example.android.bluetoothlegatt;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class UserViewModel extends AndroidViewModel {

    private UserRepository mRepository;
    private LiveData<List<User>> mAllUsers;

    public UserViewModel(@NonNull Application application) {
        super(application);
        mRepository = new UserRepository(application);
        mAllUsers = mRepository.getAllUsers();
    }

    LiveData<List<User>> getAllUsers()

    {
        return mAllUsers;
    }

    public void insert(User user) {
        mRepository.insert(user);
    }

    public void deleteAll() {mRepository.deleteAll();}

    public void deleteUser(User user) {mRepository.deleteUser(user);}
}
