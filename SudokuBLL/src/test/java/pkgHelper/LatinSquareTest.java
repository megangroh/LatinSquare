package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

@Test
public void doesElementExist_Test1() {

int [] arr = {1,2,3,4,5};
int iValue = 5;
boolean bExpected = true;
boolean bActual = LatinSquare.doesElementExist(arr, iValue);

assertEquals(bExpected, bActual);

}
@Test
public void doesElementExist_Test2() {

int [] arr = {1,2,3,4,5};
int iValue = 8;
boolean bExpected = false;
boolean bActual = LatinSquare.doesElementExist(arr, iValue);

assertEquals(bExpected, bActual);

}



@Test
public void hasDuplicates_test1() {

int [] arr = {1,2,3,4,5};

boolean bExpected = false;
boolean bActual = LatinSquare.hasDuplicates(arr);

assertEquals(bExpected, bActual);

}
@Test
public void hasDuplicates_test2() {

int [] arr = {1,2,3,4,1};

boolean bExpected = true;
boolean bActual = LatinSquare.hasDuplicates(arr);

assertEquals(bExpected, bActual);

}

@Test
public void hasDuplicates_test3() {

int [] arr1 = {1,2,3,4,1};
int [] arr2 = {1,2,3,4,1};

boolean bExpected = true;
boolean bActual = LatinSquare.hasDuplicates(arr1);


assertEquals(bExpected, bActual);


assertEquals(0, Arrays.compare(arr1, arr2));

}
}


@Test
public void getCol_test1() {

int [][] arr1 = {{1,2,3},{3,1,2},{2,3,1}};
int[] bExpected = {1,3,2};

assertEquals(bExpected, LatinSquare.getCol(0));

}

@Test
public void getCol_test2() {

int [][] arr2 = {{4,5,6},{6,4,5},{5,6,4}};
int[] bExpected = {4,6,5};

assertEquals(bExpected, LatinSquare.getCol(0));

}

@Test
public void getRow_test1() {

int [][] arr1 = {{4,5,6},{6,4,5},{5,6,4}};
int[] bExpected = {4,5,6};

assertEquals(bExpected, LatinSquare.getRow(0));

}

@Test
public void getRow_test2() {

int [][] arr2 = {{1,2,3},{3,1,2},{2,3,1}};
int[] bExpected = {1,2,3};

assertEquals(bExpected, LatinSquare.getRow(0));

}
@Test
public void hasAllValues_test1() {

int [] arr1 = {1,2,3,4,5};
int [] arr2 = {1,2,3,4,5};

boolean bExpected = true;
boolean bActual = LatinSquare.hasAllValues(arr1,arr2);


assertEquals(bExpected, bActual);
assertEquals(0, Arrays.compare(arr1, arr2));

@Test
public void hasAllValues_test2() {

int [] arr1 = {1,2,3,4,6};
int [] arr2 = {1,2,3,4,5};

boolean bExpected = false;
boolean bActual = LatinSquare.hasAllValues(arr1,arr2);


assertEquals(bExpected, bActual);
assertEquals(0, Arrays.compare(arr1, arr2));


@Test
public void containsZero_test1() {

int [] arr1 = {1,2,3,4,5};


boolean bExpected = false;
boolean bActual = LatinSquare.containsZero();
assertEquals(bExpected, bActual);

@Test
public void containsZero_test2() {

int [] arr1 = {0,1,2,3,4};


boolean bExpected = true;
boolean bActual = LatinSquare.containsZero();
assertEquals(bExpected, bActual);


@Test
public void isLatinSquare_test1() {
	int[][] arr1= {{1,2,3},{5,6,7},{10,11,0}};
	boolean bExpected = false;
	boolean bActual = LatinSquare.isLatinSquare(arr1);
	assertEquals(bExpected, bActual);
}
@Test
public void isLatinSquare_test2() {
	int[][] arr1= {{1,2,3},{2,3,1},{3,1,2}};
	boolean bExpected = true;
	boolean bActual = LatinSquare.isLatinSquare(arr1);
	assertEquals(bExpected, bActual);
}
