package org.aws;

import org.reactivestreams.Publisher;
import software.amazon.awssdk.core.SdkRequest;
import software.amazon.awssdk.core.SdkResponse;
import software.amazon.awssdk.core.async.AsyncRequestBody;
import software.amazon.awssdk.core.interceptor.Context;
import software.amazon.awssdk.core.interceptor.ExecutionAttributes;
import software.amazon.awssdk.core.interceptor.ExecutionInterceptor;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.http.SdkHttpRequest;
import software.amazon.awssdk.http.SdkHttpResponse;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Optional;

public class MyInterceptorTmp implements ExecutionInterceptor {

    public MyInterceptorTmp() {
        System.out.println("in MyInterceptor");
    }

    @Override
    public void beforeExecution(Context.BeforeExecution context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.beforeExecution(context, executionAttributes);
    }

    @Override
    public SdkRequest modifyRequest(Context.ModifyRequest context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyRequest(context, executionAttributes);
    }

    @Override
    public void beforeMarshalling(Context.BeforeMarshalling context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.beforeMarshalling(context, executionAttributes);
    }

    @Override
    public void afterMarshalling(Context.AfterMarshalling context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.afterMarshalling(context, executionAttributes);
    }

    @Override
    public SdkHttpRequest modifyHttpRequest(Context.ModifyHttpRequest context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyHttpRequest(context, executionAttributes);
    }

    @Override
    public Optional<RequestBody> modifyHttpContent(Context.ModifyHttpRequest context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyHttpContent(context, executionAttributes);
    }

    @Override
    public Optional<AsyncRequestBody> modifyAsyncHttpContent(Context.ModifyHttpRequest context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyAsyncHttpContent(context, executionAttributes);
    }

    @Override
    public void beforeTransmission(Context.BeforeTransmission context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.beforeTransmission(context, executionAttributes);
    }

    @Override
    public void afterTransmission(Context.AfterTransmission context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.afterTransmission(context, executionAttributes);
    }

    @Override
    public SdkHttpResponse modifyHttpResponse(Context.ModifyHttpResponse context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyHttpResponse(context, executionAttributes);
    }

    @Override
    public Optional<Publisher<ByteBuffer>> modifyAsyncHttpResponseContent(Context.ModifyHttpResponse context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyAsyncHttpResponseContent(context, executionAttributes);
    }

    @Override
    public Optional<InputStream> modifyHttpResponseContent(Context.ModifyHttpResponse context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyHttpResponseContent(context, executionAttributes);
    }

    @Override
    public void beforeUnmarshalling(Context.BeforeUnmarshalling context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.beforeUnmarshalling(context, executionAttributes);
    }

    @Override
    public void afterUnmarshalling(Context.AfterUnmarshalling context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.afterUnmarshalling(context, executionAttributes);
    }

    @Override
    public SdkResponse modifyResponse(Context.ModifyResponse context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyResponse(context, executionAttributes);
    }

    @Override
    public void afterExecution(Context.AfterExecution context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.afterExecution(context, executionAttributes);
    }

    @Override
    public Throwable modifyException(Context.FailedExecution context, ExecutionAttributes executionAttributes) {
        return ExecutionInterceptor.super.modifyException(context, executionAttributes);
    }

    @Override
    public void onExecutionFailure(Context.FailedExecution context, ExecutionAttributes executionAttributes) {
        ExecutionInterceptor.super.onExecutionFailure(context, executionAttributes);
    }
}
