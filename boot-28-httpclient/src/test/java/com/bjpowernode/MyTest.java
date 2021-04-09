package com.bjpowernode;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyTest {

    /**
     * get请求
     */
    @Test
    public void testGet(){
        //创建 httpClient = 看做 ajax的对象 ， 使用httpClient 发起请求，接受应答数据
        CloseableHttpClient httpClient = HttpClients.createDefault();

        String uri="https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13600000000";
        //创建Get请求对象
        HttpGet get  =new HttpGet(uri);

        //发起请求
        try {
            //CloseableHttpResponse是应答对象， 就是访问接口得到结果
            CloseableHttpResponse response  = httpClient.execute(get);
            //应答的状态信息， 可以获取Http的状态吗
            StatusLine statusLine = response.getStatusLine();
            Integer code  = statusLine.getStatusCode();
            if( code == HttpStatus.SC_OK){
                //请求成功， 获取应答数据
                HttpEntity entity = response.getEntity();
                System.out.println("entity.getContentType() = " + entity.getContentType());

                InputStream in = entity.getContent();//获取应答的内容
                //读取数据
                BufferedReader reader = new BufferedReader( new InputStreamReader(in,"GBK"));
                String line = null;

                StringBuilder builder = new StringBuilder("");
                while(  ( line = reader.readLine() ) != null){
                    builder.append(line);
                }
                System.out.println("content："+builder.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testGet2(){
        //创建 httpClient = 看做 ajax的对象 ， 使用httpClient 发起请求，接受应答数据
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String uri="https://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=13900000000";
        //创建Get请求对象
        HttpGet get  =new HttpGet(uri);
        //发起请求
        try {
            //CloseableHttpResponse是应答对象， 就是访问接口得到结果
            CloseableHttpResponse response  = httpClient.execute(get);
            //应答的状态信息， 可以获取Http的状态吗
            if( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                String res =  EntityUtils.toString(response.getEntity());
                System.out.println("res="+res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPost(){
        String url = "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm";
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建HttpPost
        HttpPost post = new HttpPost(url);

        String res = "";
        try {
            //构建post请求的参数
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            //添加参数  name=值
            params.add( new BasicNameValuePair("tel","13900000000"));
            //添加其他参数
            HttpEntity entity = new UrlEncodedFormEntity(params);
            post.setEntity(entity);

            //发起请求
            CloseableHttpResponse response = httpClient.execute(post);
            if( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK ){
                res = EntityUtils.toString(response.getEntity());
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("请求的结果："+res);

    }
}
