package com.assignment.businessboomertask.home.model;

import com.assignment.businessboomertask.productdetails.model.ProductModelDetail;
import com.assignment.businessboomertask.products.model.AuthToken;
import com.assignment.businessboomertask.products.model.Item;
import com.assignment.businessboomertask.products.model.Products;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by shika on 25-Jan-18.
 */

public interface ApiService {

    @GET("app_dev.php/api/v1/products")
    Observable<Products> getProducts(@Header("Authorization") String accessToken , @Query("page") int pageNumber , @Query("limit") int limit);

    @FormUrlEncoded
    @POST("app_dev.php/api/oauth/v2/token")
    Observable<AuthToken> getToken(@Field("client_id") String client ,@Field("client_secret") String clientSecret , @Field("grant_type") String grant , @Field("username")String username , @Field("password") String password);

    @GET("app_dev.php/api/v1/products/{code}")
    Observable<ProductModelDetail> getSingleProduct(@Path("code") String code , @Header("Authorization") String accessToken );
}
