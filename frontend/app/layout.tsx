import type { Metadata } from "next";
import { Fira_Sans } from "next/font/google";
import "./globals.css";
import React from "react";

const body = Fira_Sans({
  subsets: ["latin"],
  weight: ["100", "200", "300", "400", "500", "600", "700", "800", "900"],
  display: "swap",
});

export const metadata: Metadata = {
  title: "Final Project",
  description: "Our final project for Advanced Java Frameworks",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className={body.className}>{children}</body>
    </html>
  );
}
