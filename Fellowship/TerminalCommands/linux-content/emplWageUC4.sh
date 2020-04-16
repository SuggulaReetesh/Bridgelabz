#!/bin/bash -x
isPartTime=1;
isFullTime=2;
empRateperHr=20;

randomCheck=$(( RANDOM % 3 ))

case $randomCheck in
		$isFullTime)
				empHr=8
				;;
		$isPartTime)
				empHr=4
				;;
		*)
				empHr=0
				;;
esac
salary=$(( $empHr * $empRateperHr ));
