package com.tank.principle.singleresponsibility;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2020/5/14 11:35
 * @Version: 1.0
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle vehicle = new Vehicle();
        vehicle.run("Ħ�г�");
        vehicle.run("����");
        vehicle.run("�ɻ�");
    }

}

// ��ͨ������
// ��ʽ1
// 1. �ڷ�ʽ1 ��run�����У�Υ���˵�һְ��ԭ��
// 2. ����ķ����ǳ��ļ򵥣����ݽ�ͨ�������з�����ͬ���ֽ�ɲ�ͬ�༴��
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " �ڹ�·������....");
    }
}
