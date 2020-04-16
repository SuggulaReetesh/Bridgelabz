#!/bin/bash -x
read -p "Enter empRateperHr " empRateperHr ;
read -p "Enter empHr " empHr;
salary=$(( $empHr*$empRateperHr));

