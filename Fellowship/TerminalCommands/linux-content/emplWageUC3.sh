#!/bin/bash -x

isPartTime=1;
isFullTime=2;
empRateperHr=20

randomCheak=$(( RANDOM % 2 ))

if [ $isFullTime -eq $randomCheak ];
then
	empHr=8;
elif [ $isPartTime -eq $randomCheak ];
then
	empHr=4;

fi
salary=$(( empHr * empRateperHr ));