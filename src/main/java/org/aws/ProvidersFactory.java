package org.aws;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ProvidersFactory {

    private static List<Class<?>> providersClasses = new ArrayList<>();

    static {
        providersClasses.add(SqsProvider2.class);
        providersClasses.add(SnsProvider2.class);
        providersClasses.add(SesProvider2.class);
        providersClasses.add(S3Provider2.class);
        providersClasses.add(SsmProvider2.class);
        providersClasses.add(StsClient2.class);
        providersClasses.add(SwfProvider2.class);
        providersClasses.add(LambdaProvider2.class);
        providersClasses.add(KmsProvider2.class);
        providersClasses.add(KinesisProvider2.class);
        providersClasses.add(KendraProvider2.class);
        providersClasses.add(IotProvider2.class);
        providersClasses.add(Ec2Provider2.class);
    }

    public static void createProvidersOnBackground() throws InterruptedException {
        try{


            List<Object> providers = new ArrayList<>();
            List<Thread> threads = new ArrayList<>();

            providersClasses.forEach(aClass -> threads.add(new Thread(() -> {
                try {
                    Thread.currentThread().sleep(10);
                    System.out.println("creating provider on background "+aClass.getSimpleName());
                    providers.add(aClass.getDeclaredConstructor().newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            })));

            for (Thread thread : threads) {
                thread.start();
//                thread.join();
            }

//            if (!(providers.size() == providersClasses.size())){
//                throw new RuntimeException("missing providers");
//            }


        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void createProvidersOnCurrentThread() throws InterruptedException {
        try{

            List<Object> providers = new ArrayList<>();

            providersClasses.forEach(new Consumer<Class<?>>() {
                @Override
                public void accept(Class<?> aClass) {
                    try {
                        System.out.println("creating provider on current thread "+aClass.getSimpleName());
                        providers.add(aClass.getDeclaredConstructor().newInstance());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            if (!(providers.size() == providersClasses.size())){
                throw new RuntimeException("missing providers");
            }


        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

}
